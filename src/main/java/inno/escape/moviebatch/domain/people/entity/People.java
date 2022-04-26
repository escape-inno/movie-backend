package inno.escape.moviebatch.domain.people.entity;

import inno.escape.moviebatch.domain.movie.entity.Filmo;
import inno.escape.moviebatch.global.Constants;
import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class People extends BaseAuditingEntity {

    private String koreaName;
    private String englishName;
    private Constants.ROLE role;

}
