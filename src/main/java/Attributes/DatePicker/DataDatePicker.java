package Attributes.DatePicker;

import Base.BaseData;
import lombok.Data;
import Enum.*;

@Data
public class DataDatePicker extends BaseData {
    private EnumsDecleration.DatePickerMode mode;
    private EnumsDecleration.DatePickerCalenderMode calenderMode;
}
