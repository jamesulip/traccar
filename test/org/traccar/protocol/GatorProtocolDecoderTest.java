package org.traccar.protocol;

import org.traccar.helper.TestDataManager;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.traccar.helper.DecoderVerifier.verify;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;

public class GatorProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        GatorProtocolDecoder decoder = new GatorProtocolDecoder(new TestDataManager(), null, null);
        
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[] {0x24,0x24,0x80,0x00,0x26,0x00,0x09,0x63,0x2d,0x14,0x11,0x21,0x07,0x27,0x02,0x05,0x92,0x26,0x18,0x01,0x04,0x36,0x75,0x00,0x00,0x00,0x00,0xc0,0x47,0x00,0x07,0x9c,0x0c,0x34,0x00,0x0a,0xd8,0x0b,0x00,0xff,0x00,0x0a,0x0d}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[] {0x24,0x24,0x81,0x00,0x23,0x0C,0xA2,0x32,0x85,0x10,0x03,0x06,0x14,0x59,0x07,0x02,0x23,0x46,0x90,0x11,0x35,0x29,0x47,0x00,0x00,0x00,0x00,0xC0,0x40,0x01,0x01,0x2C,0x0E,0x11,0x00,0x00,0x00,0x21,0xCB,0x0D}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[] {0x24,0x24,0x80,0x00,0x23,0xc2,0x63,0x1e,0x00,0x11,0x12,0x20,0x10,0x49,0x09,0x83,0x32,0x68,0x64,0x87,0x03,0x80,0x41,0x00,0x00,0x00,0x00,0xc0,0x47,0x00,0x00,0x00,0x0b,0x4e,0x00,0x00,0x00,0x00,0x55,0x0d}))));

        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(
                new int[] {0x24,0x24,0x80,0x00,0x26,0x00,0x09,0x63,0x2d,0x14,0x11,0x21,0x07,0x27,0x02,0x05,0x92,0x26,0x18,0x01,0x04,0x36,0x75,0x00,0x00,0x00,0x00,0xc0,0x47,0x00,0x07,0x9c,0x0c,0x34,0x00,0x0a,0xd8,0x0b,0x00,0xff,0x00,0x0a,0x0d}))));
        
    }

}
