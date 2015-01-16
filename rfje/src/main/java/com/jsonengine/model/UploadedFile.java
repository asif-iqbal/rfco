package com.jsonengine.model;

import java.io.Serializable;
import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.Model;
import org.slim3.util.BeanUtil;
import org.slim3.util.CopyOptions;

import com.google.appengine.api.blobstore.BlobInfo;
import com.google.appengine.api.blobstore.BlobInfoFactory;
import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.ServingUrlOptions;

@Model(schemaVersion = 1)
public class UploadedFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    private String blobKey;

    private String filename;

    private String contentType;

    private Long size;

    private Date creation;

    private String md5Hash;

    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    public String getBlobKey() {
        return blobKey;
    }

    public void setBlobKey(String blobKey) {
        this.blobKey = blobKey;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public String getMd5Hash() {
        return md5Hash;
    }

    public void setMd5Hash(String md5Hash) {
        this.md5Hash = md5Hash;
    }

    public String getServeURL() {
        return String.format("/blobstore/serve?blobKey=%s", blobKey);
    }

    public String getImageURL() {
        BlobKey blobKey = new BlobKey(this.blobKey);
        ImagesService imagesService = ImagesServiceFactory.getImagesService();     
        ServingUrlOptions options = ServingUrlOptions.Builder.withBlobKey(blobKey);
        return imagesService.getServingUrl(options);
    }

    public static Key createKey(BlobKey blobKey) {
        return Datastore.createKey(UploadedFile.class, blobKey.getKeyString());
    }

    public static UploadedFile getInstance(BlobKey blobKey) {
        BlobInfoFactory factory = new BlobInfoFactory();

        UploadedFile model = new UploadedFile();
        model.setBlobKey(blobKey.getKeyString());
        BlobInfo blobInfo = factory.loadBlobInfo(blobKey);
        BeanUtil.copy(blobInfo, model, new CopyOptions().exclude("blobKey"));
        return model;
    }

    public static UploadedFile getInstance(BlobKey blobKey, String filename) {
        UploadedFile model = getInstance(blobKey);
        model.setFilename(filename);
        return model;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UploadedFile other = (UploadedFile) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
}
