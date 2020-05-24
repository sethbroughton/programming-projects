//create a context menu
chrome.contextMenus.create({
    //string to display on menu
    'title': 'Search for current stock price',
    //contexts here is selection as we want to extract the highlighted text.
    'contexts': ['selection'],
    //the event handler
    'onclick': async (context) => {
        const name = context.selectionText;
        const response = await fetch(`https://sandbox.iexapis.com/stable/stock/${name}/quote?token=Tsk_ce46deb86c0d49e389b13e82b92f5808`)
        const {
            latestPrice
            
        } = await response.json()
        const newLine = "\r\n"
        let message = `Price : ${latestPrice}`
        alert(message)
    }
});