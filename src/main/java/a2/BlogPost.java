package a2;

import lombok.Builder;
import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

// Jacksonized annotation for deserialization support.
@Jacksonized
@Builder
@Getter
@EqualsAndHashCode
@ToString
public class BlogPost {

    private final String id;
    private final String authorId; // This represents the person ID.
    private final String postContent;

    // Private constructor for validation and controlled object creation.
    private BlogPost(String id, String authorId, String postContent) {
        if (id == null) throw new IllegalArgumentException("ID cannot be null.");
        if (authorId == null) throw new IllegalArgumentException("Author ID cannot be null.");

        this.id = id;
        this.authorId = authorId;
        this.postContent = postContent;
    }
}
