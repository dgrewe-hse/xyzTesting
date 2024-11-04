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
    python_requires=">=3.6",  # Specify your minimum Python version
    install_requires=[
        "pytest==8.3.3",  # Updated pytest version
        "pydantic==1.8.2",  # Added pydantic
        "pytest-cov==5.0.0",  # Added pytest-cov
        "python-dotenv==0.19.0",  # Added python-dotenv
        "flake8>=6.0.0",  # Updated flake8 version
        "behave==1.2.6",  # Added behave
    ],
    # For running tests using pytest, nose2, and additional nose plugins
    test_suite="tests",
    tests_require=["pytest"],
    setup_requires=[
        "pytest-runner"
    ],  # pytest-runner will allow you to run tests using `python setup.py test`
    extras_require={
        "dev": [
            "pytest",
            "flake8",
        ],  # This will ensure pytest, flake8 is installed for development or testing
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
