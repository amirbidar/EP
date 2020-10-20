package Attributes.DatePicker;

import Base.BaseData;
import Widgets.DatePicker;
import lombok.Data;

@Data
public class DataDatePicker extends BaseData {
    private Enum.Enums.DatePickerMode mode;
    private Enum.Enums.DatePickerCalenderMode calenderMode;
}
