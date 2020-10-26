package Attributes.DatePicker;

import lombok.Data;

@Data
class CallBack {
    private String onSuccess;
    private String fireCondition;
    private String before;
    private String condition;
}
