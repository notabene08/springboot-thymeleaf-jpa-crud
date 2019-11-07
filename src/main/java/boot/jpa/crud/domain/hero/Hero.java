package boot.jpa.crud.domain.hero;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private int age;

    @Column(columnDefinition = "TEXT")
    private String note;

    @Builder
    public Hero(Long id, String name, int age, String note) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.note = note;
    }
}