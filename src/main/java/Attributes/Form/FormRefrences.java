package Attributes.Form;

import lombok.Data;

import java.util.List;
@Data
public class FormRefrences {
  private String referenceName;
  private String value;
  List<MReference> references;

  @Data
    class MReference{
        private String referenceName;
        private EventPopup events;



    }


}
