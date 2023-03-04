package org.sdaee24;

import lombok.Data;

@Data //POJO
public class WashRequest {
    private String uniqueWashId; //unique wash id
    private String washDateTime; //wash date time
}
