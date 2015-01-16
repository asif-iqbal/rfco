package com.jsonengine.controller.blob;

import java.util.List;
import java.util.Map;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.jsonengine.service.blob.UploadFileService;

public class UploadController extends Controller {

    private UploadFileService uploadFileService = new UploadFileService();

    private BlobstoreService blobstoreService =
        BlobstoreServiceFactory.getBlobstoreService();

    @Override
    public Navigation run() throws Exception {
        //Map<String, BlobKey> blobs = blobstoreService.getUploadedBlobs(request);
    	//BlobKey blobKey = blobs.get("uploadFile");
        Map<String, List<BlobKey>> blobs = blobstoreService.getUploads(request);
        BlobKey blobKey = blobs.get("uploadFile").get(0);
        uploadFileService.entry(blobKey);
        return redirect(basePath);
    }
}
