package cn.wangzhi17.ezviz.player.event

import com.facebook.react.bridge.WritableMap
import com.facebook.react.uimanager.events.Event
import com.facebook.react.uimanager.events.RCTEventEmitter

class OnLoadEvent(viewId: Int, private val mEventData: WritableMap) : Event<OnPlayFailedEvent>(viewId) {
    companion object {
        const val EVENT_NAME = "onLoad"
    }

    override fun getEventName(): String = OnPlayFailedEvent.EVENT_NAME

    override fun canCoalesce(): Boolean = false

    override fun getCoalescingKey(): Short = 0

    override fun dispatch(rctEventEmitter: RCTEventEmitter) =
            rctEventEmitter.receiveEvent(viewTag, eventName, mEventData)
}