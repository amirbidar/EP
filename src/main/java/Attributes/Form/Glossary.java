package Attributes.Form;

import com.sun.org.glassfish.gmbal.NameValue;
import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
public class Glossary{
    @XmlElement(name = "name")
    String name;
}
