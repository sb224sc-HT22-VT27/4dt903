"""
Script to generate synthetic image data for testing the CNN notebook.
This creates sample images for 10 product categories.

Run this script before running the image_classification_cnn.ipynb notebook.
"""

import os
import numpy as np
from PIL import Image, ImageDraw, ImageFont
import random

# Configuration
IMG_SIZE = 224
NUM_CLASSES = 10
SAMPLES_PER_CLASS = {"train": 80, "validation": 15, "test": 15}

# Product categories
CATEGORIES = [
    "electronics",
    "clothing",
    "furniture",
    "books",
    "toys",
    "sports",
    "food",
    "beauty",
    "automotive",
    "home_garden",
]

# Color schemes for each category (to make them visually distinct)
CATEGORY_COLORS = {
    "electronics": [(50, 50, 100), (100, 100, 150)],
    "clothing": [(200, 150, 150), (150, 100, 100)],
    "furniture": [(139, 90, 43), (101, 67, 33)],
    "books": [(255, 253, 208), (200, 180, 120)],
    "toys": [(255, 182, 193), (255, 105, 180)],
    "sports": [(100, 200, 100), (50, 150, 50)],
    "food": [(255, 200, 100), (255, 150, 50)],
    "beauty": [(255, 192, 203), (255, 160, 220)],
    "automotive": [(70, 70, 70), (40, 40, 40)],
    "home_garden": [(144, 238, 144), (60, 179, 113)],
}


def create_synthetic_image(category, img_size=224):
    """
    Create a synthetic image for a given category.
    Uses simple geometric patterns and colors to distinguish categories.
    """
    # Create base image with category-specific colors
    colors = CATEGORY_COLORS[category]

    # Random background color from category palette
    bg_color = colors[random.randint(0, 1)]
    img = Image.new("RGB", (img_size, img_size), color=bg_color)
    draw = ImageDraw.Draw(img)

    # Add some random shapes based on category
    num_shapes = random.randint(3, 8)

    for _ in range(num_shapes):
        shape_type = random.choice(["rectangle", "ellipse", "line"])

        # Random position and size
        x1 = random.randint(0, img_size - 50)
        y1 = random.randint(0, img_size - 50)
        x2 = x1 + random.randint(20, 100)
        y2 = y1 + random.randint(20, 100)

        # Slightly vary color
        color = tuple(
            [
                min(255, max(0, c + random.randint(-30, 30)))
                for c in colors[random.randint(0, 1)]
            ]
        )

        if shape_type == "rectangle":
            draw.rectangle([x1, y1, x2, y2], fill=color, outline=(0, 0, 0))
        elif shape_type == "ellipse":
            draw.ellipse([x1, y1, x2, y2], fill=color, outline=(0, 0, 0))
        elif shape_type == "line":
            draw.line([x1, y1, x2, y2], fill=color, width=3)

    # Add some noise to make it more realistic
    pixels = np.array(img)
    noise = np.random.randint(-20, 20, pixels.shape)
    pixels = np.clip(pixels + noise, 0, 255).astype(np.uint8)
    img = Image.fromarray(pixels)

    # Add text label (optional, for debugging)
    try:
        # Try to use a basic font
        draw = ImageDraw.Draw(img)
        draw.text((10, 10), category[:4], fill=(255, 255, 255))
    except:
        pass

    return img


def generate_dataset():
    """
    Generate the complete dataset with train/validation/test splits.
    """
    print("Generating synthetic image dataset...")

    # Create directory structure
    for split in ["train", "validation", "test"]:
        for category in CATEGORIES:
            dir_path = os.path.join("data", split, category)
            os.makedirs(dir_path, exist_ok=True)

    # Generate images for each split and category
    for split, num_samples in SAMPLES_PER_CLASS.items():
        print(f"\nGenerating {split} set...")
        for category in CATEGORIES:
            print(f"  - {category}: {num_samples} images")
            for i in range(num_samples):
                img = create_synthetic_image(category, IMG_SIZE)

                # Save image
                filename = f"{category}_{i:04d}.jpg"
                filepath = os.path.join("data", split, category, filename)
                img.save(filepath, quality=95)

    # Generate a single test image for the predict function
    print("\nGenerating sample test image...")
    test_category = random.choice(CATEGORIES)
    img = create_synthetic_image(test_category, IMG_SIZE)
    test_dir = os.path.join("data", "test")
    os.makedirs(test_dir, exist_ok=True)
    img.save(os.path.join(test_dir, "sample_product.jpg"), quality=95)

    print("\n" + "=" * 60)
    print("Dataset generation complete!")
    print("=" * 60)
    print(f"\nDataset structure:")
    print(f"  - Categories: {len(CATEGORIES)}")
    print(f"  - Training images: {SAMPLES_PER_CLASS['train'] * len(CATEGORIES)}")
    print(f"  - Validation images: {SAMPLES_PER_CLASS['validation'] * len(CATEGORIES)}")
    print(f"  - Test images: {SAMPLES_PER_CLASS['test'] * len(CATEGORIES)}")
    print(f"\nTotal images: {sum(SAMPLES_PER_CLASS.values()) * len(CATEGORIES)}")
    print(f"\nImages saved in: ./data/")


def verify_dataset():
    """
    Verify the generated dataset structure.
    """
    print("\nVerifying dataset...")
    for split in ["train", "validation", "test"]:
        split_path = os.path.join("data", split)
        if os.path.exists(split_path):
            categories_found = os.listdir(split_path)
            categories_found = [
                c
                for c in categories_found
                if os.path.isdir(os.path.join(split_path, c))
            ]
            print(f"{split}: {len(categories_found)} categories found")

            for category in categories_found[:3]:  # Show first 3
                cat_path = os.path.join(split_path, category)
                num_images = len(
                    [f for f in os.listdir(cat_path) if f.endswith(".jpg")]
                )
                print(f"  - {category}: {num_images} images")


if __name__ == "__main__":
    # Set random seed for reproducibility
    random.seed(42)
    np.random.seed(42)

    # Generate dataset
    generate_dataset()

    # Verify
    verify_dataset()

    print("\nYou can now run the image_classification_cnn.ipynb notebook!")
