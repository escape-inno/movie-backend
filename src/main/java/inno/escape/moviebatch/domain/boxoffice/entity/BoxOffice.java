package inno.escape.moviebatch.domain.boxoffice.entity;

import inno.escape.moviebatch.global.model.entity.BaseAuditingEntity;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "box_office")
public class BoxOffice extends BaseAuditingEntity {

  private static final long serialVersionUID = -4354015219029516786L;
  @Column(name = "ranked_date")
  protected Timestamp rankedDate;
  @OneToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;
  @Column(name = "ranking")
  private int ranking;
}
