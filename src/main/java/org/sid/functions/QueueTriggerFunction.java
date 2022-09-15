package org.sid.functions;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Azure Storage Queue trigger.
 */
public class QueueTriggerFunction {
    /**
     * This function will be invoked when a new message is received at the specified path. The message contents are provided as input to this function.
     */
    @FunctionName("sbprocessor")
    public void serviceBusProcess(
            @ServiceBusQueueTrigger(name = "msg",
                    queueName = "funcqueue",
                    connection = "ServiceBusConnection") String message,
            final ExecutionContext context
    ) {
        context.getLogger().info(message);
    }
}
