import Attributes.Form.GeneralForm;
import Attributes.Form.Glossary;
import Attributes.Form.ResourcesForm;
import Base.Form;
import Widgets.ComboBox;
import Widgets.DatePicker;
import Widgets.Label;
import Widgets.TextField;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {

    public static void main(String[] args) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            ComboBox pojo = xmlMapper.readValue(getXmlString(), ComboBox.class);
            System.out.println(pojo);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "<dropdown \n" +
                "\t\t value =\"#{roleMapper.id}\" \n" +
                "\t\t editable =\"true\" \n" +
                "\t\t tooltip =\"asdasdasda\" \n" +
                "\t\t\n" +
                " name= \"Combobox3031\" \t\t enabled= \"true\" \t\t label= \"asdasd\" \t layoutable= \"true\" \n" +
                "\t\t>\n" +
                "\t\n" +
                "\t\t\n" +
                "\t<layout-data>\n" +
                "\t\t<grid-layout-data\n" +
                "\t\t\t\n" +
                "\t\t\t\trow-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tcol-span=\"1\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-grab=\"true\" \n" +
                "\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-grab=\"true\" \n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\tv-alignment=\"center\" \n" +
                "\t\t\t\n" +
                "\t\t\t\n" +
                "\t\t\th-alignment=\"center\"\n" +
                "\t\t\t \n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t/>\n" +
                "\t</layout-data>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<items \n" +
                "\t\t var= \"id\" \n" +
                "\t\t value= \"1\" \n" +
                "\t\t empty-item-label= \"null\" \n" +
                "\t\t condition= \"null\" \n" +
                "\t\t>\n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t<item\n" +
                "\t\t\t name = \"ComboItem3033\" \n" +
                "\t\t\t value = \"asdsad\" \n" +
                "\t\t\t label = \"label\" \n" +
                "\t\t\t \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"Sdsadasda\" \t\tto-value=\"String\" \t\tto-object=\"String\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</item>\n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t\t<item\n" +
                "\t\t\t name = \"asdasd\" \n" +
                "\t\t\t value = \"asdasd\" \n" +
                "\t\t\t label = \"asdasd\" \n" +
                "\t\t\t \n" +
                "\t\t\t>\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"fassdsd\" \t\tto-value=\"String\" \t\tto-object=\"String\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\t</item>\n" +
                "\t\t\t\n" +
                "\t\t\t \n" +
                "\t\t</items>\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<events>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-focus-lost\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_3032\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-focus-lost>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-load\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_3145\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-load>\n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t <on-selection-change \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\tclient-side-language= \"inherit\"\n" +
                "\taction=\"#{}\"\n" +
                "\t\n" +
                "\tname=\"event_3146\" \n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\trun-at= \"server\"\n" +
                "\t>\n" +
                "\n" +
                "\t\n" +
                "\t </on-selection-change> \n" +
                "\t\n" +
                "\t \n" +
                "\n" +
                "\t\t\n" +
                "\t\t</events>\n" +
                "\n" +
                "\t\t\n" +
                "\t   \t\t<listeners>\n" +
                "\t   \t\t\n" +
                "\t   \t\t\t\n" +
                "\t\n" +
                "\t\t<phase-listener\n" +
                "\t\tphase=\"after_update_model\"\n" +
                "\t\taction=\"#{}\"\n" +
                "\t\t/>\n" +
                "\n" +
                "\t   \t\t\n" +
                "\t   \t\t</listeners>\n" +
                "   \t\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t<validators>\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t<script-validator \n" +
                "\t\t\n" +
                "\t\t\tclient-side-language= \"inherit\"\n" +
                "\t\tscript=\"\"\n" +
                "\t\t\n" +
                "\t\trun-at= \"client\"\n" +
                "\t\t\n" +
                "\t/>\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\t<required-validator \n" +
                "\t\trun-at= \"client\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t<number-validator \n" +
                "\t\tinteger=\"false\"\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\tinclude-minimum-boundry=\"false\"\n" +
                "\t\tinclude-maximum-boundry=\"false\"\n" +
                "\t\trun-at= \"client\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t<string-validator \n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\trun-at= \"client\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t\t\n" +
                "\t\n" +
                "\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t<email-validator \n" +
                "\t\trun-at= \"client\"\n" +
                "\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t</validators>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\t\t<converter\n" +
                "\t\tfactory=\"name\" \t\tto-value=\"String\" \t\tto-object=\"String\" \t\tavoid-null-values= \"true\"\n" +
                "\t\t/>\n" +
                "\t\n" +
                "\n" +
                "\t\t\n" +
                "\t\t</dropdown>\n" +
                "\t\t\n" +
                "\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\n";
    }
}


