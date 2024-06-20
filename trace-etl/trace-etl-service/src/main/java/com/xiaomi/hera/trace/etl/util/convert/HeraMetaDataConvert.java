/*
 * Copyright 2020 Xiaomi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.xiaomi.hera.trace.etl.util.convert;

import com.xiaomi.hera.trace.etl.domain.metadata.HeraMetaData;
import com.xiaomi.hera.trace.etl.domain.metadata.HeraMetaDataMessage;
import com.xiaomi.hera.trace.etl.domain.metadata.HeraMetaDataModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(uses = {HeraMetaDataPortModelConvert.class})
public interface HeraMetaDataConvert {

    HeraMetaDataConvert INSTANCE = Mappers.getMapper(HeraMetaDataConvert.class);

    HeraMetaDataModel toModel(HeraMetaData heraMetaData);

    HeraMetaData toBo(HeraMetaDataModel heraMetaData);

    HeraMetaData messageToBo(HeraMetaDataMessage message);

    List<HeraMetaDataModel> toModelList(List<HeraMetaData> heraMetaData);

    List<HeraMetaData> toBoList(List<HeraMetaDataModel> heraMetaData);
}
