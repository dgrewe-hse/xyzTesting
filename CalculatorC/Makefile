# Compiler and flags
CC = gcc
CFLAGS = -Wall -I/usr/local/include -I/opt/homebrew/Include	-I./src	# Include both /usr/local and /opt/homebrew for headers as well as /src to include header files
LDFLAGS = -L/usr/local/lib -L/opt/homebrew/lib -lcunit       		# Link to libraries in /usr/local and /opt/homebrew

# Directories
SRC_DIR = src
TEST_DIR = tests
BUILD_DIR = build

# Target executable
TARGET = $(BUILD_DIR)/calculator_test

# Source and test files
SRC = $(SRC_DIR)/calculator.c
TEST_SRC = $(TEST_DIR)/test_calculator.c

# Default target
all: $(TARGET)

# Compile the test executable
$(TARGET): $(SRC) $(TEST_SRC)
	mkdir -p $(BUILD_DIR)
	$(CC) $(SRC) $(TEST_SRC) $(CFLAGS) $(LDFLAGS) -o $(TARGET)

# Clean up the build directory
clean:
	rm -rf $(BUILD_DIR)

# Run the tests
test: $(TARGET)
	./$(TARGET)