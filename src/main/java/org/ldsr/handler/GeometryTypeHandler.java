package org.ldsr.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.locationtech.jts.geom.Geometry;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Geometry.class)
@MappedJdbcTypes(JdbcType.OTHER)
public class GeometryTypeHandler extends BaseTypeHandler<Geometry> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Geometry parameter, JdbcType jdbcType) throws SQLException {
        // 设置PreparedStatement中对应位置的参数值
        ps.setObject(i, parameter);
    }

    @Override
    public Geometry getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 从ResultSet中获取对应列名的值，并转换为Geometry类型
        return (Geometry) rs.getObject(columnName);
    }

    @Override
    public Geometry getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 从ResultSet中获取对应列索引的值，并转换为Geometry类型
        return (Geometry) rs.getObject(columnIndex);
    }

    @Override
    public Geometry getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 从CallableStatement中获取对应列索引的值，并转换为Geometry类型
        return (Geometry) cs.getObject(columnIndex);
    }
}
