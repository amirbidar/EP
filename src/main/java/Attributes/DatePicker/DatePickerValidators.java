package Attributes.DatePicker;

import Base.Validationss.DateRangeValidator;
import Base.Validationss.RequiredValidator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DatePickerValidators {
    @JsonProperty("required-validator")
    public List<RequiredValidator> requiredValidator;
    @JsonProperty("date-range-validator")
    public List<DateRangeValidator> dateRangeValidator;
}
