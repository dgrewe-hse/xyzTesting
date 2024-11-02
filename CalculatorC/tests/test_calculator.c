/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include <CUnit/CUnit.h>
#include <CUnit/Basic.h>
#include <stdlib.h>
#include "calculator.h"

/**
 * @brief Helper function to create a dynamic array for input.
 *
 * @param size The size of the array.
 * @param values The values to be added to the array.
 * @return A dynamically allocated array of the given values.
 */
double* create_array(int size, double values[]) {
    double* arr = (double*)malloc(sizeof(double) * size);  // Dynamically allocate memory
    for (int i = 0; i < size; i++) {
        arr[i] = values[i];
    }
    return arr;
}

/**
 * @brief Unit test for the add function.
 */
void test_add() {
    double values[] = {1.0, 2.0, 3.0};
    double* numbers = create_array(3, values);
    CU_ASSERT_DOUBLE_EQUAL(add(numbers, 3, NULL), 6.0, 0.0001);
    free(numbers);  // Free allocated memory

    double single[] = {5.0};
    numbers = create_array(1, single);
    CU_ASSERT_DOUBLE_EQUAL(add(numbers, 1, NULL), 5.0, 0.0001);
    free(numbers);

    double empty[] = {};
    numbers = create_array(0, empty);
    CU_ASSERT_DOUBLE_EQUAL(add(numbers, 0, NULL), 0.0, 0.0001);
    free(numbers);
}

/**
 * @brief Unit test for the subtract function.
 */
void test_subtract() {
    double values[] = {10.0, 3.0, 2.0};
    double* numbers = create_array(3, values);
    CU_ASSERT_DOUBLE_EQUAL(subtract(numbers, 3, NULL), 5.0, 0.0001);
    free(numbers);

    double single[] = {5.0};
    numbers = create_array(1, single);
    CU_ASSERT_DOUBLE_EQUAL(subtract(numbers, 1, NULL), 5.0, 0.0001);
    free(numbers);

    double empty[] = {};
    numbers = create_array(0, empty);
    CU_ASSERT_DOUBLE_EQUAL(subtract(numbers, 0, NULL), 0.0, 0.0001);
    free(numbers);
}

/**
 * @brief Unit test for the multiply function.
 */
void test_multiply() {
    double values[] = {2.0, 3.0, 4.0};
    double* numbers = create_array(3, values);
    CU_ASSERT_DOUBLE_EQUAL(multiply(numbers, 3, NULL), 24.0, 0.0001);
    free(numbers);

    double single[] = {5.0};
    numbers = create_array(1, single);
    CU_ASSERT_DOUBLE_EQUAL(multiply(numbers, 1, NULL), 5.0, 0.0001);
    free(numbers);

    double empty[] = {};
    numbers = create_array(0, empty);
    CU_ASSERT_DOUBLE_EQUAL(multiply(numbers, 0, NULL), 1.0, 0.0001);
    free(numbers);
}

/**
 * @brief Unit test for the divide function.
 */
void test_divide() {
    double values[] = {100.0, 5.0, 2.0};
    double* numbers = create_array(3, values);
    CU_ASSERT_DOUBLE_EQUAL(divide(numbers, 3, NULL), 10.0, 0.0001);
    free(numbers);

    double single[] = {5.0};
    numbers = create_array(1, single);
    CU_ASSERT_DOUBLE_EQUAL(divide(numbers, 1, NULL), 5.0, 0.0001);
    free(numbers);

    double empty[] = {};
    numbers = create_array(0, empty);
    CU_ASSERT_DOUBLE_EQUAL(divide(numbers, 0, NULL), 1.0, 0.0001);
    free(numbers);
}

/**
 * @brief Main function to run the tests.
 */
int main() {
    // Initialize CUnit test registry
    if (CUE_SUCCESS != CU_initialize_registry()) {
        return CU_get_error();
    }

    // Add test suite
    CU_pSuite pSuite = CU_add_suite("CalculatorTestSuite", 0, 0);

    // Add tests to suite
    if (NULL == pSuite ||
        (NULL == CU_add_test(pSuite, "test_add", test_add)) ||
        (NULL == CU_add_test(pSuite, "test_subtract", test_subtract)) ||
        (NULL == CU_add_test(pSuite, "test_multiply", test_multiply)) ||
        (NULL == CU_add_test(pSuite, "test_divide", test_divide))) {
        CU_cleanup_registry();
        return CU_get_error();
    }

    // Run tests using the basic interface
    CU_basic_set_mode(CU_BRM_VERBOSE);
    CU_basic_run_tests();

    // Clean up the registry and return
    CU_cleanup_registry();
    return CU_get_error();
}
