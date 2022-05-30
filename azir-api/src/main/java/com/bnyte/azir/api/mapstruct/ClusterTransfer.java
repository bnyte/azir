package com.bnyte.azir.api.mapstruct;

import com.bnyte.azir.api.vo.cluster.ClusterVO;
import com.bnyte.azir.api.vo.tenant.TenantVO;
import com.bnyte.azir.common.entity.console.Cluster;
import com.bnyte.azir.common.entity.console.Tenant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author bnyte
 * @since 2022/5/28 18:30
 */
@Mapper
public interface ClusterTransfer {

    ClusterTransfer INSTANCE = Mappers.getMapper(ClusterTransfer.class);

    Cluster toDomain(ClusterVO clusterVO);

    ClusterVO toVO(Cluster cluster);

    List<ClusterVO> toVOS(List<Cluster> clusters);


}