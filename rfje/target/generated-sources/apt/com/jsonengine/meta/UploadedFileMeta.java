package com.jsonengine.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2013-02-09 20:37:26")
/** */
public final class UploadedFileMeta extends org.slim3.datastore.ModelMeta<com.jsonengine.model.UploadedFile> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.UploadedFile> blobKey = new org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.UploadedFile>(this, "blobKey", "blobKey");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.UploadedFile> contentType = new org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.UploadedFile>(this, "contentType", "contentType");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.UploadedFile, java.util.Date> creation = new org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.UploadedFile, java.util.Date>(this, "creation", "creation", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.UploadedFile> filename = new org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.UploadedFile>(this, "filename", "filename");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.UploadedFile, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.UploadedFile, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.UploadedFile> md5Hash = new org.slim3.datastore.StringAttributeMeta<com.jsonengine.model.UploadedFile>(this, "md5Hash", "md5Hash");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.UploadedFile, java.lang.Long> size = new org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.UploadedFile, java.lang.Long>(this, "size", "size", java.lang.Long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.UploadedFile, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<com.jsonengine.model.UploadedFile, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final UploadedFileMeta slim3_singleton = new UploadedFileMeta();

    /**
     * @return the singleton
     */
    public static UploadedFileMeta get() {
       return slim3_singleton;
    }

    /** */
    public UploadedFileMeta() {
        super("UploadedFile", com.jsonengine.model.UploadedFile.class);
    }

    @Override
    public com.jsonengine.model.UploadedFile entityToModel(com.google.appengine.api.datastore.Entity entity) {
        com.jsonengine.model.UploadedFile model = new com.jsonengine.model.UploadedFile();
        model.setBlobKey((java.lang.String) entity.getProperty("blobKey"));
        model.setContentType((java.lang.String) entity.getProperty("contentType"));
        model.setCreation((java.util.Date) entity.getProperty("creation"));
        model.setFilename((java.lang.String) entity.getProperty("filename"));
        model.setKey(entity.getKey());
        model.setMd5Hash((java.lang.String) entity.getProperty("md5Hash"));
        model.setSize((java.lang.Long) entity.getProperty("size"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        com.jsonengine.model.UploadedFile m = (com.jsonengine.model.UploadedFile) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("blobKey", m.getBlobKey());
        entity.setProperty("contentType", m.getContentType());
        entity.setProperty("creation", m.getCreation());
        entity.setProperty("filename", m.getFilename());
        entity.setProperty("md5Hash", m.getMd5Hash());
        entity.setProperty("size", m.getSize());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        com.jsonengine.model.UploadedFile m = (com.jsonengine.model.UploadedFile) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        com.jsonengine.model.UploadedFile m = (com.jsonengine.model.UploadedFile) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        com.jsonengine.model.UploadedFile m = (com.jsonengine.model.UploadedFile) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        com.jsonengine.model.UploadedFile m = (com.jsonengine.model.UploadedFile) model;
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
        com.jsonengine.model.UploadedFile m = (com.jsonengine.model.UploadedFile) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getBlobKey() != null){
            writer.setNextPropertyName("blobKey");
            encoder0.encode(writer, m.getBlobKey());
        }
        if(m.getContentType() != null){
            writer.setNextPropertyName("contentType");
            encoder0.encode(writer, m.getContentType());
        }
        if(m.getCreation() != null){
            writer.setNextPropertyName("creation");
            encoder0.encode(writer, m.getCreation());
        }
        if(m.getFilename() != null){
            writer.setNextPropertyName("filename");
            encoder0.encode(writer, m.getFilename());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getMd5Hash() != null){
            writer.setNextPropertyName("md5Hash");
            encoder0.encode(writer, m.getMd5Hash());
        }
        if(m.getSize() != null){
            writer.setNextPropertyName("size");
            encoder0.encode(writer, m.getSize());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected com.jsonengine.model.UploadedFile jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        com.jsonengine.model.UploadedFile m = new com.jsonengine.model.UploadedFile();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("blobKey");
        m.setBlobKey(decoder0.decode(reader, m.getBlobKey()));
        reader = rootReader.newObjectReader("contentType");
        m.setContentType(decoder0.decode(reader, m.getContentType()));
        reader = rootReader.newObjectReader("creation");
        m.setCreation(decoder0.decode(reader, m.getCreation()));
        reader = rootReader.newObjectReader("filename");
        m.setFilename(decoder0.decode(reader, m.getFilename()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("md5Hash");
        m.setMd5Hash(decoder0.decode(reader, m.getMd5Hash()));
        reader = rootReader.newObjectReader("size");
        m.setSize(decoder0.decode(reader, m.getSize()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}