/*
 * RED5 HLS plugin - https://github.com/mondain/red5-hls-plugin Copyright 2006-2013 by respective authors (see below). All rights reserved. Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package org.red5.xuggler.writer;

import java.util.concurrent.TimeUnit;

import org.red5.service.httpstream.SegmentFacade;

import com.xuggle.xuggler.ICodec;
import com.xuggle.xuggler.IRational;
import com.xuggle.xuggler.ISimpleMediaFile;
import com.xuggle.xuggler.IVideoPicture;

public interface IStreamWriter {

    public abstract int addAudioStream(int streamId, ICodec codec, int channelCount, int sampleRate);

    public abstract int addVideoStream(int streamId, ICodec codec, IRational frameRate, int width, int height);

    public abstract void encodeAudio(short[] samples, long timeStamp, TimeUnit timeUnit);

    public abstract void encodeVideo(IVideoPicture picture);

    public abstract void setup(SegmentFacade facade, ISimpleMediaFile outputStreamInfo);

    public abstract void open();

    public abstract void close();

    public abstract void start();

}
