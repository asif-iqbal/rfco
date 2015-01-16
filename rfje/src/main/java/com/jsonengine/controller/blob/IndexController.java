package com.jsonengine.controller.blob;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.appengine.api.blobstore.UploadOptions;
import com.jsonengine.model.UploadedFile;
import com.jsonengine.service.blob.UploadFileService;

public class IndexController extends Controller {

    private UploadFileService uploadFileService = new UploadFileService();

    private BlobstoreService blobstoreService =
        BlobstoreServiceFactory.getBlobstoreService();

    @Override
    public Navigation run() throws Exception {
        final long MEGA_BYTE = 1024 * 1024 * 1024;
        UploadOptions options =
            UploadOptions.Builder.withMaxUploadSizeBytes(100 * MEGA_BYTE);
        String uploadUrl =
            blobstoreService.createUploadUrl("/blob/upload", options);
        requestScope("uploadUrl", uploadUrl);

        List<UploadedFile> uploadedFiles =
            uploadFileService.getUploadedFileList();
        requestScope("uploadedFiles", uploadedFiles);
        return forward("index.jsp");
    }
}
