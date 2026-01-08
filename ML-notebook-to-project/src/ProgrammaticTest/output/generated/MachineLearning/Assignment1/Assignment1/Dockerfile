FROM python:3.13-slim

WORKDIR /app

# Copy requirements first (for better caching)
COPY requirements.txt .

# Set up virtual environment and install dependencies
RUN python -m venv /opt/venv

ENV PATH='/opt/venv/bin:$PATH'

# Install dependencies
RUN pip install --upgrade pip && \\ 
			pip install -r requirements.txt

# Copy project files
COPY src/ ./src/
COPY data/ ./data/
COPY models/ ./models/
COPY outputs/ ./outputs/

# Expose the port for prediction service
EXPOSE 8080

# Run the main script
CMD ['python', 'src/main.py']
CMD ['python', 'src/server.py']