package org.sdaee24;

import lv.axs.gw.mapping.WashObjectsMapper;
import org.mapstruct.factory.Mappers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OurDatabase implements DataStorageService {
    private WashObjectsMapper washObjectsMapper = Mappers.getMapper(WashObjectsMapper.class);
    private Map<UUID, WashResponse> storageFile = new HashMap<>();

    @Override
    public WashResponse storeWashRequest(WashRequest washRequest) {
        WashResponse washResponse = washObjectsMapper.toWashResponse(washRequest);
        storageFile.put(washResponse.getUniqueWashId(),washResponse);
        return washResponse;
    }
}
