package Attributes.Form;

import lombok.Data;

import java.util.List;
@Data
public class PopupForm {

    List<MPopup> popups;

    @Data
    class MPopup{
      private String popupName;
      private BaseEvents events;

    }
}
