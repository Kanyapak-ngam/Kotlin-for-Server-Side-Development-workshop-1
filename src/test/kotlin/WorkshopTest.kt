
import org.example.Product
import org.example.calculateTotalElectronicsPriceOver500
import org.example.countElectronicsOver500
import org.example.celsiusToFahrenheit
import org.example.kilometersToMiles
import kotlin.test.Test
import kotlin.test.assertEquals

class WorkshopTest {

    // --- Tests for Workshop #1: Unit Converter ---

    // celsius input: 20.0
    // expected output: 68.0
    @Test
    fun `test celsiusToFahrenheit with positive value`() {
        //Arrange
        val celsiusInput = 20.0
        val expectedFahrenheit = 68.0

        //Act
        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)

        //Assert
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "20°C should be 68°F")
    }

    // celsius input: 0.0
    // expected output: 32.0
    @Test
    fun `test celsiusToFahrenheit with zero`() {
        //Arrange
        val result = celsiusToFahrenheit(0.0)
        assertEquals(32.0, result, 0.001, "0°C should be 32°F")
    }

    // celsius input: -10.0
    // expected output: 14.0
    @Test
    fun `test celsiusToFahrenheit with negative value`() {
        //Act
        val result = celsiusToFahrenheit(-10.0)

        //Assert
        assertEquals(14.0, result, 0.001, "-10°C should be 14°F")
    }

    // test for kilometersToMiles function
    // kilometers input: 1.0
    // expected output: 0.621371
    @Test
    fun `test kilometersToMiles with one kilometer`() {
        // Arrange
        val kilometersInput = 1.0
        val expectedMiles = 0.621371

        // Act
        val actualMiles = kilometersToMiles(kilometersInput)
        // Assert
        assertEquals(expectedMiles, actualMiles, 0.000001, "1 km should be 0.621371 miles")
    }

    // --- Tests for Workshop #1: Unit Converter End ---

    // --- Tests for Workshop #2: Data Analysis Pipeline ---

    // ✅ ตรวจสอบผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
    @Test
    fun `test calculateTotalElectronicsPriceOver500 with sample products`() {
        //Arrange
        val products = listOf(
            Product("Laptop", 35000.0, "Electronics"),
            Product("Smartphone", 25000.0, "Electronics"),
            Product("Monitor", 7500.0, "Electronics"),
            Product("Keyboard", 499.0, "Electronics"), // ไม่ถึง 500
            Product("Headphones", 1800.0, "Electronics"),
            Product("T-shirt", 450.0, "Apparel"),
            Product("Jeans", 1200.0, "Apparel")
        )

        val actualTotal = calculateTotalElectronicsPriceOver500(products)
        //Act
        val expectedTotal = 35000.0 + 25000.0 + 7500.0 + 1800.0

        //Assert
        assertEquals(expectedTotal, actualTotal, 0.001, "ผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท ไม่ถูกต้อง")
    }

    // ✅ ตรวจสอบจำนวนสินค้าที่อยู่ในหมวด Electronics และมีราคามากกว่า 500 บาท
    @Test
    fun `test countElectronicsOver500 with sample products`() {
        //Arrange
        val products = listOf(
            Product("Laptop", 35000.0, "Electronics"),
            Product("Smartphone", 25000.0, "Electronics"),
            Product("Monitor", 7500.0, "Electronics"),
            Product("Keyboard", 499.0, "Electronics"), // ไม่ถึง 500
            Product("Headphones", 1800.0, "Electronics"),
            Product("T-shirt", 450.0, "Apparel"),
            Product("Jeans", 1200.0, "Apparel")
        )

        val actualCount = countElectronicsOver500(products)
        //Act
        val expectedCount = 4
        //Assert
        assertEquals(expectedCount, actualCount, "จำนวนสินค้าที่เป็น Electronics และราคา > 500 บาท ไม่ถูกต้อง")
    }

    // --- Tests for Workshop #2: Data Analysis Pipeline End ---
}










































































//import org.example.celsiusToFahrenheit
//import kotlin.test.Test
//import kotlin.test.assertEquals
//
//class WorkshopTest {
//
//    // --- Tests for Workshop #1: Unit Converter ---
//
//    // celsius input: 20.0
//    // expected output: 68.0
//    @Test
//    fun `test celsiusToFahrenheit with positive value`() {
//        // Arrange: ตั้งค่า input และผลลัพธ์ที่คาดหวัง
//        val celsiusInput = 20.0
//        val expectedFahrenheit = 68.0
//
//        // Act: เรียกใช้ฟังก์ชันที่ต้องการทดสอบ
//        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)
//
//        // Assert: ตรวจสอบว่าผลลัพธ์ที่ได้ตรงกับที่คาดหวัง
//        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "20°C should be 68°F")
//    }
//
//    // celsius input: 0.0
//    // expected output: 32.0
//    @Test
//    fun `test celsiusToFahrenheit with zero`() {
//
//    }
//
//    // celsius input: -10.0
//    // expected output: 14.0
//    @Test
//    fun `test celsiusToFahrenheit with negative value`() {
//
//    }
//
//    // test for kilometersToMiles function
//    // kilometers input: 1.0
//    // expected output: 0.621371
//    @Test
//    fun `test kilometersToMiles with one kilometer`() {
//
//    }
//
//    // --- Tests for Workshop #1: Unit Converter End ---
//
//    // --- Tests for Workshop #2: Data Analysis Pipeline ---
//    // ทำการแก้ไขไฟล์ Workshop2.kt ให้มีฟังก์ชันที่ต้องการทดสอบ
//    // เช่น ฟังก์ชันที่คำนวณผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
//    // ในที่นี้จะสมมุติว่ามีฟังก์ชันชื่อ calculateTotalElectronicsPriceOver500 ที่รับ List<Product> และคืนค่า Double
//    // จงเขียน test cases สำหรับฟังก์ชันนี้ โดยตรวจสอบผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท
//    // 🚨
//
//    // จงเขียน test cases เช็คจำนวนสินค้าที่อยู่ในหมวด 'Electronics' และมีราคามากกว่า 500 บาท
//    // 🚨
//
//
//    // --- Tests for Workshop #2: Data Analysis Pipeline End ---
//}
//import org.example.Product
//import org.example.calculateTotalElectronicsPriceOver500
//import org.example.celsiusToFahrenheit
//import org.example.countElectronicsOver500
//import org.example.kilometersToMiles
//import kotlin.test.Test
//import kotlin.test.assertEquals
//
//
//
//class WorkshopTest {
//
//    // --- Tests for Workshop #1: Unit Converter ---
//
//    // celsius input: 20.0
//    // expected output: 68.0
//    @Test
//    fun `test celsiusToFahrenheit with positive value`() {
//        val celsiusInput = 20.0
//        val expectedFahrenheit = 68.0
//        val actualFahrenheit = celsiusToFahrenheit(celsiusInput)
//        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "20°C should be 68°F")
//    }
//
//    // celsius input: 0.0
//    // expected output: 32.0
//    @Test
//    fun `test celsiusToFahrenheit with zero`() {
//        val result = celsiusToFahrenheit(0.0)
//        assertEquals(32.0, result, 0.001, "0°C should be 32°F")
//    }
//
//    // celsius input: -10.0
//    // expected output: 14.0
//    @Test
//    fun `test celsiusToFahrenheit with negative value`() {
//        val result = celsiusToFahrenheit(-10.0)
//        assertEquals(14.0, result, 0.001, "-10°C should be 14°F")
//    }
//
//    // test for kilometersToMiles function
//    // kilometers input: 1.0
//    // expected output: 0.621371
//    @Test
//    fun `test kilometersToMiles with one kilometer`() {
//        val result = kilometersToMiles(1.0)
//        assertEquals(0.621371, result, 0.000001, "1 km should be 0.621371 miles")
//    }
//
//    // --- Tests for Workshop #1: Unit Converter End ---
//
//    // --- Tests for Workshop #2: Data Analysis Pipeline ---
//
//    @Test
//    fun `test calculateTotalElectronicsPriceOver500 with sample products`() {
//        val products = listOf(
//            Product("Laptop", 35000.0, "Electronics"),
//            Product("Smartphone", 25000.0, "Electronics"),
//            Product("Monitor", 7500.0, "Electronics"),
//            Product("Keyboard", 499.0, "Electronics"), // ไม่ถึง 500
//            Product("Headphones", 1800.0, "Electronics"),
//            Product("T-shirt", 450.0, "Apparel"),
//            Product("Jeans", 1200.0, "Apparel")
//        )
//
//        val actualTotal
//        actualTotal = calculateTotalElectronicsPriceOver500(products)
//        val expectedTotal = 35000.0 + 25000.0 + 7500.0 + 1800.0
//        assertEquals(expectedTotal, actualTotal, 0.001, "ผลรวมราคาสินค้า Electronics ที่ราคา > 500 บาท ไม่ถูกต้อง")
//    }
//
//
//
//    @Test
//    fun `test countElectronicsOver500 with sample products`() {
//        val products = listOf(
//            Product("Laptop", 35000.0, "Electronics"),
//            Product("Smartphone", 25000.0, "Electronics"),
//            Product("Monitor", 7500.0, "Electronics"),
//            Product("Keyboard", 499.0, "Electronics"),
//            Product("Headphones", 1800.0, "Electronics"),
//            Product("T-shirt", 450.0, "Apparel"),
//            Product("Jeans", 1200.0, "Apparel")
//        )
//
//        val actualCount = countElectronicsOver500(products)
//        val expectedCount = 4
//        assertEquals(expectedCount, actualCount, "จำนวนสินค้าที่เป็น Electronics และราคา > 500 บาท ไม่ถูกต้อง")
//    }
//
//    // --- Tests for Workshop #2: Data Analysis Pipeline End ---
//}