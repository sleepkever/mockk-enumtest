import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class KotlinClassWithEnumMemberTest {

    @MockK
    lateinit var testmock: KotlinClassWithEnumMember

    @Before
    fun setUp() = MockKAnnotations.init(this)

    @Test
    fun `Test mocking enum member in class`() {
        val mockedClass = mockk<KotlinClassWithEnumMember>()
        every { mockedClass.type } returns KotlinClassWithEnumMember.EnumType.ONE
        assertEquals(KotlinClassWithEnumMember.EnumType.ONE, mockedClass.type, "Enum returned does not match mocked response")
    }

    @Test
    fun `Test mocking enum member in lateinit class`() {
        every { testmock.type } returns KotlinClassWithEnumMember.EnumType.ONE
        assertEquals(KotlinClassWithEnumMember.EnumType.ONE, testmock.type, "Enum returned does not match mocked response")
    }

    @Test
    fun `Test mocking string member in lateinit class`() {
        every { testmock.typeString } returns "teststring"
        assertEquals("teststring", testmock.typeString, "Enum returned does not match mocked response")
    }
}