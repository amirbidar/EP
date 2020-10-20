package Attributes.DynamicComboBox;

import Base.*;
import lombok.Data;

import java.util.concurrent.locks.Condition;

@Data
public class DynamicComboboxData extends BaseItem {
    private String condition;
    private String emptyItem;
    private String finder;
    private String variable;
}
