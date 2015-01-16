package com.jsonengine.controller.blob;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;

public class ServeController extends Controller {

    private BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();

    @Override
    public Navigation run() throws Exception {
        BlobKey blobKey = new BlobKey(requestScope("blobKey").toString());
        blobstoreService.serve(blobKey, response);
        return null;
    }
}
