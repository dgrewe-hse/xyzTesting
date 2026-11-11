# Copyright (c) 2024. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
# nder the terms of the GNU General Public License version 3 only, as
# published by the Free Software Foundation.
#
# This code is distributed for educational purposes only, but WITHOUT
# ANY WARRANTY; See the GNU General Public License version 3 for more
# details (a copy is included in the LICENSE file that
# accompanied this code).
from setuptools import setup, find_packages

# Package metadata
setup(
    name="CalculatorPython",  # projectName
    version="1.0.0",  # project version
    description="A simple calculator application supporting arithmetic operations.",
    long_description=open("README.md").read(),
    long_description_content_type="text/markdown",
    author="Dennis Grewe",
    author_email="dennis.grewe@hs-esslingen.de",
    packages=find_packages(),  # Automatically finds all packages (e.g., calculator.py)
    # Include the dependencies required for your project
    python_requires=">=3.9",  # Specify your minimum Python version
    # Runtime dependencies: none (test tooling lives in requirements.txt)
    install_requires=[],
    extras_require={
        "dev": [
            "pytest>=9.0,<10",
            "pytest-cov>=7.0,<8",
            "flake8>=7.0,<8",
            "behave>=1.3,<2",
        ],  # Install with: pip install -e ".[dev]"
    },
    # Optional: Include additional metadata
    classifiers=[
        "Programming Language :: Python :: 3",  # Python 3 support
        "License :: OSI Approved :: Apache License 2.0",  # License
        "Operating System :: OS Independent",  # OS compatibility
    ],
    # Optional: Automatically include all .txt and other files
    include_package_data=True,
)
