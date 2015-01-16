package com.jsonengine.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2015-01-17 00:45:04")
/** */
public final class JEDocMeta extends org.slim3.datastore.ModelMeta<com.jsonengine.model.JEDoc> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.JEDoc, java.lang.Long> createdAt = new org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.JEDoc, java.lang.Long>(this, "createdAt", "createdAt", long.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.JEDoc> createdBy = new org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.JEDoc>(this, "createdBy", "createdBy");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.JEDoc> docType = new org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.JEDoc>(this, "docType", "docType");

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<com.jsonengine.model.JEDoc, java.util.Map<java.lang.String,java.lang.Object>> docValues = new org.slim3.datastore.UnindexedAttributeMeta<com.jsonengine.model.JEDoc, java.util.Map<java.lang.String,java.lang.Object>>(this, "docValues", "docValues", java.util.Map.class);

    /** */
    public final org.slim3.datastore.StringCollectionAttributeMeta<com.jsonengine.model.JEDoc, java.util.Set<java.lang.String>> indexEntries = new org.slim3.datastore.StringCollectionAttributeMeta<com.jsonengine.model.JEDoc, java.util.Set<java.lang.String>>(this, "indexEntries", "indexEntries", java.util.Set.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.JEDoc, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.JEDoc, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.JEDoc, java.lang.Long> updatedAt = new org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.JEDoc, java.lang.Long>(this, "updatedAt", "updatedAt", long.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.JEDoc> updatedBy = new org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.JEDoc>(this, "updatedBy", "updatedBy");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.JEDoc, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.JEDoc, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final JEDocMeta slim3_singleton = new JEDocMeta();

    /**
     * @return the singleton
     */
    public static JEDocMeta get() {
       return slim3_singleton;
    }

    /** */
    public JEDocMeta() {
        super("JEDoc", com.jsonengine.model.JEDoc.class);
    }

    @Override
    public com.jsonengine.model.JEDoc entityToModel(com.google.appengine.api.datastore.Entity entity) {
        com.jsonengine.model.JEDoc model = new com.jsonengine.model.JEDoc();
        model.setCreatedAt(longToPrimitiveLong((java.lang.Long) entity.getProperty("createdAt")));
        model.setCreatedBy((java.lang.String) entity.getProperty("createdBy"));
        model.setDocType((java.lang.String) entity.getProperty("docType"));
        java.util.Map<java.lang.String,java.lang.Object> _docValues = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("docValues"));
        model.setDocValues(_docValues);
        model.setIndexEntries(new java.util.HashSet<java.lang.String>(toList(java.lang.String.class, entity.getProperty("indexEntries"))));
        model.setKey(entity.getKey());
        model.setUpdatedAt(longToPrimitiveLong((java.lang.Long) entity.getProperty("updatedAt")));
        model.setUpdatedBy((java.lang.String) entity.getProperty("updatedBy"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        com.jsonengine.model.JEDoc m = (com.jsonengine.model.JEDoc) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("createdAt", m.getCreatedAt());
        entity.setProperty("createdBy", m.getCreatedBy());
        entity.setProperty("docType", m.getDocType());
        entity.setUnindexedProperty("docValues", serializableToBlob(m.getDocValues()));
        entity.setProperty("indexEntries", m.getIndexEntries());
        entity.setProperty("updatedAt", m.getUpdatedAt());
        entity.setProperty("updatedBy", m.getUpdatedBy());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        com.jsonengine.model.JEDoc m = (com.jsonengine.model.JEDoc) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        com.jsonengine.model.JEDoc m = (com.jsonengine.model.JEDoc) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        com.jsonengine.model.JEDoc m = (com.jsonengine.model.JEDoc) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        com.jsonengine.model.JEDoc m = (com.jsonengine.model.JEDoc) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        com.jsonengine.model.JEDoc m = (com.jsonengine.model.JEDoc) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        writer.setNextPropertyName("createdAt");
        encoder0.encode(writer, m.getCreatedAt());
        if(m.getCreatedBy() != null){
            writer.setNextPropertyName("createdBy");
            encoder0.encode(writer, m.getCreatedBy());
        }
        if(m.getDocType() != null){
            writer.setNextPropertyName("docType");
            encoder0.encode(writer, m.getDocType());
        }
        if(m.getDocValues() != null){
            writer.setNextPropertyName("docValues");
            encoder0.encode(writer, m.getDocValues());
        }
        if(m.getIndexEntries() != null){
            writer.setNextPropertyName("indexEntries");
            writer.beginArray();
            for(java.lang.String v : m.getIndexEntries()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        writer.setNextPropertyName("updatedAt");
        encoder0.encode(writer, m.getUpdatedAt());
        if(m.getUpdatedBy() != null){
            writer.setNextPropertyName("updatedBy");
            encoder0.encode(writer, m.getUpdatedBy());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected com.jsonengine.model.JEDoc jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        com.jsonengine.model.JEDoc m = new com.jsonengine.model.JEDoc();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("createdAt");
        m.setCreatedAt(decoder0.decode(reader, m.getCreatedAt()));
        reader = rootReader.newObjectReader("createdBy");
        m.setCreatedBy(decoder0.decode(reader, m.getCreatedBy()));
        reader = rootReader.newObjectReader("docType");
        m.setDocType(decoder0.decode(reader, m.getDocType()));
        reader = rootReader.newObjectReader("docValues");
        m.setDocValues(decoder0.decode(reader, m.getDocValues(), java.util.Map.class));
        reader = rootReader.newObjectReader("indexEntries");
        {
            java.util.HashSet<java.lang.String> elements = new java.util.HashSet<java.lang.String>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("indexEntries");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    java.lang.String v = decoder0.decode(reader, (java.lang.String)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setIndexEntries(elements);
            }
        }
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("updatedAt");
        m.setUpdatedAt(decoder0.decode(reader, m.getUpdatedAt()));
        reader = rootReader.newObjectReader("updatedBy");
        m.setUpdatedBy(decoder0.decode(reader, m.getUpdatedBy()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}