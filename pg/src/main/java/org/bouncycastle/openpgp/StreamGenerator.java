package org.bouncycastle.openpgp;

import java.io.IOException;

/**
 * Callback interface for generators that produce a stream to be informed when the stream has been
 * closed by the client. Complies with Java's own {@link AutoCloseable} interface
 */
interface StreamGenerator extends AutoCloseable
{
    /**
     * Signal that the stream has been closed.
     */
    @Override
    void close()
        throws IOException;
}
