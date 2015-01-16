package com.jsonengine.service.blob;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.datastore.Key;
import com.jsonengine.meta.UploadedFileMeta;
import com.jsonengine.model.UploadedFile;

public class UploadFileService {

    private UploadedFileMeta meta = UploadedFileMeta.get();

    public Key entry(BlobKey blobKey) {
        UploadedFile uploadedFile = UploadedFile.getInstance(blobKey);
        uploadedFile.setKey(UploadedFile.createKey(blobKey));
        return Datastore.put(uploadedFile);
    }

    public Key entry(BlobKey blobKey, String filename) {
        UploadedFile uploadedFile = UploadedFile.getInstance(blobKey, filename);
        uploadedFile.setKey(UploadedFile.createKey(blobKey));
        return Datastore.put(uploadedFile);
    }

    public List<UploadedFile> getUploadedFileList() {
        return Datastore.query(meta).asList();
    }
}
