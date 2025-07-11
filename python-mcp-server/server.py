from mcp.server.fastmcp import FastMCP
mcp = FastMCP('Python-MCP-Server')
@mcp.tool()
def get_employee_info(name : str) -> str:

    return {
        "employee_name" : name,
        "salary":5400,
    }