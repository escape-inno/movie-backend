package inno.escape.moviebatch.domain.people.entity;

import inno.escape.moviebatch.domain.movie.entity.Filmo;
import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "people")
public class People extends BaseAuditingEntity {

    @Id
    @Column(name = "id", columnDefinition = "VARCHAR(36)", updatable = false, nullable = false)
    private String id;

    @Column(name = "korea_name")
    private String koreaName;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "role_name")
    private String roleName;

    @OneToOne
    @JoinColumn(name = "filmo_id")
    private Filmo filmo;

    @Column(name = "gender")
    private String gender;
}
