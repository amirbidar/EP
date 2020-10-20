package Base;

import Base.BaseConverter;
import lombok.Data;

import java.util.List;

@Data
public class BaseEntities {
    private String variable;
    private String propertyValue;
    private String condition;
    List<EntityProperties> entityProperties;
    @Data
    class EntityProperties{
        private String name;
        private String id;
        private String label;
        private String value;
        private String editable;
        private List<Properties> properties;
        @Data
        class Properties{
            private String name;
            private String value;
            private BaseConverter converter;
        }
    }

}

