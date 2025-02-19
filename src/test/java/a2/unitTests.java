package a2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testValidPerson() {
        Person person = Person.builder()
                .id("100")
                .firstName("Meetkumar")
                .lastName("Pandya")
                .age(25)
                .gender("Male")
                .build();

        assertNotNull(person);
        assertEquals("Meetkumar", person.getFirstName());
        assertEquals("Pandya", person.getLastName());
        assertEquals(25, person.getAge());
    }

    @Test
    public void testInvalidPerson() {
        // Testing invalid input: null id
        assertThrows(IllegalArgumentException.class, () -> {
            Person.builder()
                    .firstName("Meetkumar")
                    .lastName("Pandya")
                    .age(25)
                    .gender("Male")
                    .build();
        });
    }
}

class BlogPostTest {

    @Test
    public void testValidBlogPost() {
        BlogPost post = BlogPost.builder()
                .id("101")
                .authorId("1")
                .postContent("This is a unit test.")
                .build();

        assertNotNull(post);
        assertEquals("101", post.getId());
        assertEquals("1", post.getAuthorId());
    }

    @Test
    public void testInvalidBlogPost() {
        // Testing invalid input: null authorId
        assertThrows(IllegalArgumentException.class, () -> {
            BlogPost.builder()
                    .id("101")
                    .postContent("This is a unit test.")
                    .build();
        });
    }
}

