package com.github.braisdom.objsql;

import com.github.braisdom.objsql.transition.ColumnTransitional;

import java.util.Objects;

/**
 * Describes the Java Bean which maps a row in the table, and it
 *
 * @param <T> the bean class
 */
public interface TableRowAdapter<T> {

    T newInstance();

    void setGeneratedKey(T bean, Object primaryKeyValue);

    String getFieldName(String columnName);

    Object getFieldValue(Object bean, String fieldName);

    Class getFieldType(String fieldName);

    boolean isTransitable(String fieldName);

    ColumnTransitional getColumnTransition(String fieldName);

    void setValue(T modelObject, String fieldName, Object fieldValue);

    Object getValue(T modelObject, String fieldName);
}
