FROM python:3.13-slim

WORKDIR /app

# Copy requirements first (for better caching)
COPY requirements.txt .

# Set up virtual environment and install dependencies
RUN python -m venv /opt/venv
ENV PATH="/opt/venv/bin:$PATH"


# Install dependencies
RUN pip install --upgrade pip && \ 
		pip install -r requirements.txt

# Copy project files
COPY src/ ./src/
COPY data/ ./data/
COPY models/ ./models/
COPY outputs/ ./outputs/

# Expose port for prediction service
EXPOSE 8080

# Run the prediction server
CMD ["python", "src/server.py"]
