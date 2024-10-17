# Compiler and flags
CC = gcc
CFLAGS = -Wall -I./src -I/usr/local/include -I/opt/homebrew/Include	# Include both /usr/local and /opt/homebrew for headers as well as /src to include header files
LDFLAGS = -L/usr/local/lib -L/opt/homebrew/lib -lcunit       		# Link to libraries in /usr/local and /opt/homebrew

# Directories
SRC_DIR = src
TEST_DIR = tests
BUILD_DIR = build

# Test executables
TARGET_CALC = $(BUILD_DIR)/calculator_test
TARGET_MOCK = $(BUILD_DIR)/calculator_mock_test

# Source and test files
SRC = $(SRC_DIR)/calculator.c $(SRC_DIR)/logging_service.c
TEST_SRC = $(TEST_DIR)/test_calculator.c
MOCK_TEST_SRC = $(TEST_DIR)/test_calculator_mock.c

# Default target for building both test suites
all: $(TARGET_CALC) $(TARGET_MOCK)

# Compile the regular test suite
$(TARGET_CALC): $(SRC) $(TEST_SRC)
	mkdir -p $(BUILD_DIR)
	$(CC) $(SRC) $(TEST_SRC) $(CFLAGS) $(LDFLAGS) -o $(TARGET_CALC)

# Compile the mock test suite
$(TARGET_MOCK): $(SRC) $(MOCK_TEST_SRC)
	mkdir -p $(BUILD_DIR)
	$(CC) $(SRC) $(MOCK_TEST_SRC) $(CFLAGS) $(LDFLAGS) -o $(TARGET_MOCK)

# Clean up the build directory
clean:
	rm -rf $(BUILD_DIR)

# Run both regular and mock tests
test: $(TARGET_CALC) $(TARGET_MOCK)
	@echo "Running regular tests..."
	./$(TARGET_CALC)
	@echo "Running mock tests..."
	./$(TARGET_MOCK)