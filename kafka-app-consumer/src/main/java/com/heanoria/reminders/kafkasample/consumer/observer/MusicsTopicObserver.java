package com.heanoria.reminders.kafkasample.consumer.observer;

import com.heanoria.reminders.kafkasample.consumer.datas.MessageContainer;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MusicsTopicObserver implements Observer<MessageContainer> {

    private static final Logger logger = LoggerFactory.getLogger(MusicsTopicObserver.class);

    @Override
    public void onSubscribe(Disposable disposable) {

    }

    @Override
    public void onNext(MessageContainer messageContainer) {
        logger.info("Received {}", messageContainer.getValue());
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}