package hunt.tst.prj.util;

import javax.persistence.AttributeConverter;
import java.sql.Date;
import java.time.LocalDate;

public class JpaLocalDateConverter implements AttributeConverter<LocalDate, Date> {
  @Override
  public Date convertToDatabaseColumn(LocalDate locDate) {
    return (locDate == null ? null : Date.valueOf(locDate));
  }

  @Override
  public LocalDate convertToEntityAttribute(Date sqlDate) {
    return (sqlDate == null ? null : sqlDate.toLocalDate());
  }
}
