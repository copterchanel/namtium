package com.lion328.hydra;

import com.lion328.xenonlauncher.downloader.URLFileDownloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.GZIPInputStream;

public class GZIPFileDownloader extends URLFileDownloader
{

    public GZIPFileDownloader(URL url, File file)
    {
        super(url, file);
    }

    public GZIPFileDownloader(URL url, File file, int bufferSize)
    {
        super(url, file, bufferSize);
    }

    @Override
    protected InputStream buildInputStream(InputStream parent) throws IOException
    {
        return new GZIPInputStream(parent);
    }
}
