import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class ClassWithEnumMemberTest {

    @MockK
    lateinit var testmock: ClassWithEnumMember

    @Before
    fun setUp() = MockKAnnotations.init(this)

    @Test
    fun `Test mocking enum member in class`() {
        val mockedClass = mockk<ClassWithEnumMember>()
        every { mockedClass.type } returns ClassWithEnumMember.EnumType.ONE
        assertEquals(ClassWithEnumMember.EnumType.ONE, mockedClass.type, "Enum returned does not match mocked response")
    }

    @Test
    fun `Test mocking enum member in lateinit class`() {
        every { testmock.type } returns ClassWithEnumMember.EnumType.ONE
        assertEquals(ClassWithEnumMember.EnumType.ONE, testmock.type, "Enum returned does not match mocked response")
    }

}