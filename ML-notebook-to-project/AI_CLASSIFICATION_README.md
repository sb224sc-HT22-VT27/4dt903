# AI API Integration for Command Classification

## Overview
This implementation integrates an AI API (OpenAI) to classify Python code commands into three categories:
1. **Data Preprocessing** - Code that loads, cleans, transforms, or prepares data
2. **Model Training** - Code that trains, fits, or builds a machine learning model
3. **Prediction/Inference** - Code that makes predictions, performs inference, or evaluates a model

## Configuration

### Setting up the OpenAI API Key

The AI classification service requires an OpenAI API key to function. There are two ways to provide it:

#### Option 1: Environment Variable (Recommended)
Set the `OPENAI_API_KEY` environment variable before running the application:

```bash
export OPENAI_API_KEY="your-api-key-here"
```

On Windows:
```cmd
set OPENAI_API_KEY=your-api-key-here
```

#### Option 2: Programmatic Configuration
You can also create the service with an API key programmatically:

```java
AIClassificationService service = new AIClassificationService("your-api-key-here");
```

### Obtaining an API Key
1. Sign up at [OpenAI Platform](https://platform.openai.com/)
2. Navigate to API Keys section
3. Create a new secret key
4. Copy and securely store the key

## How It Works

### Automatic Classification
The `CodeCell` class now uses AI-based classification automatically when you call:
- `isTrainingCode()` - Returns true if the code is for model training
- `isDataPreprocessing()` - Returns true if the code is for data preprocessing
- `isPredictionCode()` - Returns true if the code is for prediction/inference

### Caching
Classification results are cached to avoid redundant API calls. The cache is automatically invalidated when the source code changes.

### Fallback Mechanism
If the API key is not set or if the API call fails, the system automatically falls back to heuristic-based classification using keyword matching. This ensures the application continues to work even without API access.

## Usage Example

```java
// In NotebookAnalyzer or similar code
CodeCell cell = ...; // Get a code cell

// These methods now use AI classification
if (cell.isDataPreprocessing()) {
    System.out.println("This is data preprocessing code");
}
if (cell.isTrainingCode()) {
    System.out.println("This is model training code");
}
if (cell.isPredictionCode()) {
    System.out.println("This is prediction/inference code");
}
```

## Architecture

### AIClassificationService
Located at: `NotebookMM/src/notebookMM/util/AIClassificationService.java`

This service:
- Constructs prompts for the AI model
- Calls the OpenAI API with code snippets
- Parses responses and categorizes code
- Implements fallback heuristics when API is unavailable

### CodeCellImpl Integration
The classification methods in `CodeCellImpl` have been updated to:
1. Use a singleton instance of `AIClassificationService`
2. Cache classification results for performance
3. Automatically invalidate cache when source code changes

## API Costs
Note that using the OpenAI API incurs costs based on usage. The implementation uses:
- Model: `gpt-3.5-turbo`
- Temperature: 0.3 (for more deterministic results)
- Max tokens: 10 (minimal response length)

These settings are optimized for cost-efficiency while maintaining accuracy.

## Testing Without API Key
You can test the system without an API key. It will automatically use the fallback heuristic-based classification, which looks for keywords like:
- Data Preprocessing: `preprocess`, `clean`, `transform`, `scaler`, `encoder`, `fillna`, `dropna`
- Model Training: `model.fit`, `model.train`, `fit_transform`, `cross_val_score`
- Prediction: `predict`, `inference`, `model.eval`, `predict_proba`

## Troubleshooting

### API Call Failures
If API calls fail, the system will:
1. Print an error message to stderr
2. Automatically fall back to heuristic classification
3. Continue processing without interruption

### Timeout Settings
The default timeout is 30 seconds. This can be adjusted in `AIClassificationService` if needed.

### Network Issues
Ensure your environment has internet access and can reach `api.openai.com`. Check firewall settings if experiencing connection issues.
