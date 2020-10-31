
import Base.Form;
import WidgetJson.FormBase;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.json.JSONObject;
import org.json.XML;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY).enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            JSONObject xmlJSONObj = XML.toJSONObject(getXmlString());
/*
            FormBase pojo = objectMapper.readValue(xmlJSONObj.toString(), FormBase.class);
*/
            System.out.println(objectMapper.readValue(xmlJSONObj.toString(),FormBase.class));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private static String getXmlString() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<form xmlns=\"http://www.itorbit.net/goofy/v2/form-definition\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema-instance\" name=\"TestForm2\" client-side-language=\"skippy\" title=\"TestForm2\" visible=\"false\" layoutable=\"true\" enabled=\"true\" rendered=\"true\" resizable=\"false\" draggable=\"true\" version=\"1\">\n" +
                "    <resources>\n" +
                "        <glossary name=\"MyReports\" />\n" +
                "    </resources>\n" +
                "    <layout>\n" +
                "        <grid-layout number-of-columns=\"1\" margin-width=\"0\" margin-height=\"0\" horizontal-spacing=\"0\" vertical-spacing=\"0\" />\n" +
                "    </layout>\n" +
                "    <children>\n" +
                "        <tree header-text=\"header\" selection-mode=\"multiple\" lazy=\"true\" auto-expand-level=\"1\" expand-all=\"true\" sort-by-query=\"true\" name=\"Tree18261\" enabled=\"true\" label=\"label\" layoutable=\"true\">\n" +
                "            <layout-data>\n" +
                "                <grid-layout-data row-span=\"1\" col-span=\"1\" v-grab=\"false\" h-grab=\"false\" v-alignment=\"center\" h-alignment=\"center\" />\n" +
                "            </layout-data>\n" +
                "            <events>\n" +
                "                <on-load phase=\"after_update_model\" condition=\"true\" client-side-language=\"inherit\" action=\"#{true}\" submit-region=\"true\" name=\"event_18284\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-load>\n" +
                "                <on-click condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_18285\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-click>\n" +
                "                <on-double-click condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_18286\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-double-click>\n" +
                "                <on-selection-change condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_18287\" re-render=\"true\" fire-condition=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-selection-change>\n" +
                "                <on-focus-lost condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_18288\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-focus-lost>\n" +
                "            </events>\n" +
                "            <listeners>\n" +
                "                <phase-listener phase=\"before_update_model\" action=\"#{}\" />\n" +
                "                <phase-listener phase=\"after_update_model\" action=\"#{}\" />\n" +
                "                <phase-listener phase=\"before_first_render\" action=\"#{}\" />\n" +
                "                <phase-listener phase=\"before_render\" action=\"#{}\" />\n" +
                "            </listeners>\n" +
                "            <validators></validators>\n" +
                "            <columns>\n" +
                "                <column name=\"Name_18280\" header=\"Header_18281\" icon=\"truetruetruetrue\" sortable=\"true\" alignment=\"begin\" width=\"80\" type=\"string\" />\n" +
                "                <column name=\"Name_18282\" header=\"Header_18283\" sortable=\"false\" alignment=\"begin\" width=\"80\" type=\"string\" />\n" +
                "            </columns>\n" +
                "            <datas></datas>\n" +
                "        </tree>\n" +
                "        <hidden name=\"LookUp_8175_last_searched_query\" value=\"#{LookUp_8175_query}\"></hidden>\n" +
                "        <hidden name=\"LookUp_11106_last_searched_query\" value=\"#{LookUp_11106_query}\"></hidden>\n" +
                "    </children>\n" +
                "</form>";
    }
}


