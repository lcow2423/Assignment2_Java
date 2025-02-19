package a2;

import java.util.List;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class Blog {

    private final List<BlogPost> posts;
    private final List<Person> contributors;

    // Constructor to initialize the Blog with posts and contributors
    public Blog(List<BlogPost> posts, List<Person> contributors) {
        this.posts = posts;
        this.contributors = contributors;
    }
}
