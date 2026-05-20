FROM debian:bullseye-slim

# Install essential packages
RUN apt-get update && export DEBIAN_FRONTEND=noninteractive \
    && apt-get -y install --no-install-recommends \
    build-essential \
    curl \
    git \
    wget \
    python3 \
    python3-pip \
    python3-venv \
    openjdk-11-jdk \
    maven \
    sudo \
    && rm -rf /var/lib/apt/lists/*

# Install Python packages
RUN pip3 install --no-cache-dir \
    pylint \
    black \
    pytest \
    mypy \
    pydantic \
    python-dotenv \
    behave \
    flake8

# Create a non-root user
ARG USERNAME=vscode
ARG USER_UID=1000
ARG USER_GID=$USER_UID

RUN groupadd --gid $USER_GID $USERNAME \
    && useradd --uid $USER_UID --gid $USER_GID -m $USERNAME \
    && mkdir -p /etc/sudoers.d \
    && echo $USERNAME ALL=\(root\) NOPASSWD:ALL > /etc/sudoers.d/$USERNAME \
    && chmod 0440 /etc/sudoers.d/$USERNAME

# Create workspace directory and set permissions
RUN mkdir -p /workspace && chown $USERNAME:$USERNAME /workspace

# Default to non-root user (devcontainer features may reset USER to root; containerUser in devcontainer.json applies at runtime)
USER $USERNAME