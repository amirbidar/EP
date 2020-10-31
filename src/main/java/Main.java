
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
            ObjectMapper objectMapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
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
                "        <password-field value=\"#{unit.id}\" readonly=\"true\" default-widget=\"true\" tooltip=\"tooltip\" max-length=\"200\" name=\"Password17916\" enabled=\"true\" label=\"label\" layoutable=\"true\">\n" +
                "            <layout-data>\n" +
                "                <grid-layout-data row-span=\"1\" col-span=\"1\" v-grab=\"false\" h-grab=\"false\" v-alignment=\"center\" h-alignment=\"center\" />\n" +
                "            </layout-data>\n" +
                "            <validators>\n" +
                "                <script-validator script=\"\" error-message=\"true\" run-at=\"server\" />\n" +
                "                <number-validator integer=\"true\" minimum-value=\"10\" maximum-value=\"20\" include-minimum-boundry=\"true\" include-maximum-boundry=\"true\" run-at=\"client\" />\n" +
                "                <required-validator run-at=\"client\" />\n" +
                "                <string-validator regular-expression=\"true\" regular-expression-error-message=\"true\" minimum-length=\"true\" maximum-length=\"true\" run-at=\"client\" />\n" +
                "                <email-validator run-at=\"client_and_server\" />\n" +
                "            </validators>\n" +
                "            <events>\n" +
                "                <on-load client-side-language=\"inherit\" action=\"#{}\" name=\"event_17947\" run-at=\"server\"></on-load>\n" +
                "                <on-load client-side-language=\"inherit\" action=\"#{}\" name=\"event_17948\" run-at=\"server\"></on-load>\n" +
                "                <on-focus-lost condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_17949\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"client\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-focus-lost>\n" +
                "                <on-deselect phase=\"after_update_model\" condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_17950\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-deselect>\n" +
                "                <on-select phase=\"after_update_model\" condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_17951\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-select>\n" +
                "                <on-edit phase=\"after_update_model\" condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_17952\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-edit>\n" +
                "                <on-change phase=\"after_update_model\" condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_17953\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-change>\n" +
                "                <on-load phase=\"after_update_model\" condition=\"true\" client-side-language=\"inherit\" action=\"#{}true\" submit-region=\"true\" name=\"event_17954\" re-render=\"true\" fire-condition=\"true\" before=\"true\" on-success=\"true\" run-at=\"server\">\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                    <argument name=\"true\" value=\"true\" />\n" +
                "                </on-load>\n" +
                "            </events>\n" +
                "            <listeners>\n" +
                "                <phase-listener phase=\"before_update_model\" action=\"#{true}\" condition=\"true\" />\n" +
                "                <phase-listener phase=\"after_update_model\" action=\"#{}true\" condition=\"true\" />\n" +
                "                <phase-listener phase=\"before_first_render\" action=\"#{}true\" condition=\"true\" />\n" +
                "                <phase-listener phase=\"before_render\" action=\"#{}true\" condition=\"true\" />\n" +
                "                <phase-listener phase=\"after_update_model\" action=\"#{}true\" condition=\"true\" />\n" +
                "            </listeners>\n" +
                "        </password-field>\n" +
                "        <hidden name=\"LookUp_8175_last_searched_query\" value=\"#{LookUp_8175_query}\"></hidden>\n" +
                "        <hidden name=\"LookUp_11106_last_searched_query\" value=\"#{LookUp_11106_query}\"></hidden>\n" +
                "    </children>\n" +
                "</form>";
    }
}


