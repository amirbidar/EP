package WidgetJson;

import Attributes.DatePicker.DatePickerValidators;
import Base.BaseConverter;
import Base.EventAll;
import Base.LayoutData;
import Base.Listeners;
import Enum.EnumsDecleration;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DatePicker {
    public Boolean layoutable;
    public String tooltip;
    public String label;
    public Boolean enabled;
    public String mode;
    public Boolean readonly;
    public EnumsDecleration.DatePickerCalenderMode calendarMode;
    public String name;
    public String value;
    public Listeners listeners;
    public EventAll events;
    public DatePickerValidators validators;
    public BaseConverter converter;
    @JsonProperty("layout-data")
    private LayoutData layoutData;

}
